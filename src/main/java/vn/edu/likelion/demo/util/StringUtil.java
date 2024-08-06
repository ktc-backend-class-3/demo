package vn.edu.likelion.demo.util;

import org.springframework.stereotype.Component;

@Component
public class StringUtil {
    public Boolean isNull (String name) {
        if (name == null) return true;
        return false;
    }
}
