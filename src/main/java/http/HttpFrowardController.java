//package http;
//
//import com.alibaba.fastjson.JSONObject;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.*;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.servlet.HandlerMapping;
//import org.springframework.web.servlet.resource.ResourceUrlProvider;
//
//import javax.servlet.http.HttpServletRequest;
//import java.net.URI;
//import java.util.Enumeration;
//import java.util.Map;
//import java.util.Objects;
//import java.util.Set;
//
//@RestController
//@Slf4j
//public class HttpFrowardController {
//
//    @RequestMapping("/forward/**")
//    public JSONObject forward(HttpServletRequest request, HttpMethod method, @RequestBody(required = false) String body) {
//        try {
//            // 根据request，构造HttpHeaders
//            HttpHeaders headers = new HttpHeaders();
//            Enumeration<String> headerNames = request.getHeaderNames();
//
//            while(headerNames.hasMoreElements()){
//                String name = headerNames.nextElement();
//                String value = request.getHeader(name);
//                if(!Objects.equals(name, "host")){
//                    headers.add(name, value);
//                }
//            }
//            headers.setContentType(MediaType.APPLICATION_JSON);
//
//            // 复制 request 的参数
//            Map<String, String[]> parameterMap = request.getParameterMap();
//            MultiValueMap<String, Object> params = new LinkedMultiValueMap<String, Object>();
//            // 附加参数值
//            Set<String> keySet = parameterMap.keySet();
//            for (String key : keySet) {
//                String[] value = parameterMap.get(key);
//                params.add(key, value[0]);
//            }
//            // 根据body内容填充requestEntity。对于form-data，body为空但parameterMap有值；对于raw，body不为空。
//            HttpEntity<Object> requestEntity = (body!=null && !body.isEmpty())? new HttpEntity<>(body, headers): new HttpEntity<>(params, headers);
//
//            // 构造URI。必须拼接出String url然后创建URI，否则会出现queryString %符号转%25的问题
//
//            ResourceUrlProvider urlProvider = (ResourceUrlProvider) request
//                    .getAttribute(ResourceUrlProvider.class.getCanonicalName());
//            String restOfUrl = urlProvider.getPathMatcher().extractPathWithinPattern(
//                    String.valueOf(request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE)),
//                    String.valueOf(request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE)));
//
//            String destUrl = "http://111111/" + restOfUrl;
//
//            if (request.getQueryString()!=null && !request.getQueryString().isEmpty())  {
//                destUrl += "?" + request.getQueryString();
//            }
//
//            URI destUri = new URI(destUrl);
//            // 向服务请求
//            RestTemplate restTemplate = new RestTemplate();
//            ResponseEntity<JSONObject> responseEntity = restTemplate.exchange(destUri, method, requestEntity, JSONObject.class);
//            return responseEntity.getBody();
//        } catch (Exception e) {
//            e.printStackTrace();
////            return new BaseResult<JSONObject>(0, "系统异常", "转发失败");
////            return "转发失败";
//            return null;
//        }
//    }
//
//}
