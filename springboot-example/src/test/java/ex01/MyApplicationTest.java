package ex01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class MyApplicationTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testMyComponent01NotNull() {
        MyComponent myComponent = applicationContext.getBean("myComponent01", MyComponent.class);
        assertNotNull(myComponent);
    }

    @Test
    void testMyComponent02Null() {
        assertThrows(
            NoSuchBeanDefinitionException.class,
            () -> applicationContext.getBean("myComponent02", MyComponent.class)
        );
    }
}
