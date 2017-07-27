package at.spring_boot.boilerplate.rest;

import at.spring_boot.boilerplate.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by LanzSteff on 27.07.2017
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(value = "/getDate", method = RequestMethod.GET)
    public @ResponseBody String getDate(@RequestParam(value = "format", defaultValue = "dd.MM.yyyy", required = false) String format) {

        return testService.date(format);
    }
}
