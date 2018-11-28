package Spring.JavaConfigDemo;

public class UserFunctionService {
    FunctionService functionService;

    public FunctionService getFunctionService() {
        return functionService;
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }


    public String sayHelloo(String word) {
        return functionService.sayHello(word);
    }
}
