package com.csp.designpattern.creation.singleton.di;

/**
 * @author csp
 * @date 2022/9/24
 */
public class NoSuchBeanDefinitionException extends RuntimeException {

    public NoSuchBeanDefinitionException() {
        super();
    }

    public NoSuchBeanDefinitionException(String message) {
        super(message);
    }

}
