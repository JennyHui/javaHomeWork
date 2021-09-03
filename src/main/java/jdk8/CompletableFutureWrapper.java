//package jdk8;
//
//import java.util.Objects;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.ScheduledThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//import java.util.function.Supplier;
//
///**
// * 一个简单的封装类，包装了对future.get()的异常处理，
// * @param <T>
// */
//public class CompletableFutureWrapper<T> {
//
//    private static final Log LOGGER = LogFactory.getLog(CompletableFutureWrapper.class);
//
//    private static ScheduledThreadPoolExecutor DELAYER = new ScheduledThreadPoolExecutor(30);
//
//    private final Supplier<T> task;
//    private final Supplier<T> demotionLogic;
//    private CompletableFuture<T> future;
//
//    private volatile T result;
//
//    private CompletableFutureWrapper(Supplier<T> task, Supplier<T> demotionLogic) {
//        this.task = task;
//        this.demotionLogic = demotionLogic;
//    }
//
//    /**
//     * 某些时候，不需要异步的行为，可以用这个方法直接返回结果
//     * @param output
//     * @param <T>
//     * @return
//     */
//    public static<T> CompletableFutureWrapper<T> just(T output) {
//        CompletableFutureWrapper<T> result = new CompletableFutureWrapper<>(() -> output, () -> output);
//        result.result = output;
//        return result;
//    }
//
//    /**
//     *
//     * @param task 任务的主要逻辑
//     * @param demotionLogic 任务的降级逻辑
//     * @param startTimeout 超时时间，从build该future wrapper开始
//     * @param pool 主任务运行的线程池
//     * @param <T>
//     * @return
//     */
//    public static<T> CompletableFutureWrapper<T> build(Supplier<T> task, Supplier<T> demotionLogic, long startTimeout, ExecutorService pool, String taskName) {
//        CompletableFutureWrapper<T> result = new CompletableFutureWrapper<>(task, demotionLogic);
//
//        String transactionId = Trace.getCurrentRequestId();
//        String rpcId = Trace.nextLocalRpcId();
//        LOGGER.debug("origin transactionId:{}, rpcId:{}", transactionId, rpcId);
//
//        CompletableFuture<T> completableFuture = CompletableFuture.supplyAsync(TraceUtil.continueTraceSupplier(task, "async_task", taskName), pool);
//
//
//        DELAYER.schedule(() -> {
//            Trace.continueTrace(transactionId, rpcId);
//            if (!completableFuture.isDone()) {
//                LOGGER.info("Timeout happens when try to execute task, use demotion logic");
//                completableFuture.complete(demotionLogic.get());
//            }
//        }, startTimeout, TimeUnit.MILLISECONDS);
//
//        result.future = completableFuture;
//        return result;
//    }
//
//    /**
//     * 阻塞方法，慎用，一般有后台线程会自行中断任务线程的时候使用
//     * 一般是单线程情况下适用，多线程状态下应该也没有坑
//     * @return
//     */
//    public T fetchResult() {
//        if (Objects.isNull(result)) {
//            try {
//                result = future.get();
//            } catch (Exception ex) {
//                LOGGER.error("Fail to execute task, error happens, use demotion logic ", ex);
//                result = demotionLogic.get();
//            }
//        }
//
//        return result;
//    }
//
//    /**
//     * fastJson序列化识别使用
//     * @return
//     */
//    public T getResult(){
//        return result;
//    }
//}