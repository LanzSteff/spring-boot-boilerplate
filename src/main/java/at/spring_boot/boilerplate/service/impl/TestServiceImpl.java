package at.spring_boot.boilerplate.service.impl;

import at.spring_boot.boilerplate.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by LanzSteff on 27.07.2017
 */
@Service
public class TestServiceImpl implements TestService {

    private static final Logger LOG = LoggerFactory.getLogger(TestServiceImpl.class);

    public String date(String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date today = Calendar.getInstance().getTime();
        String result = dateFormat.format(today);
        LOG.info("REST GET date output: {}", result);
        return result;
    }
}
