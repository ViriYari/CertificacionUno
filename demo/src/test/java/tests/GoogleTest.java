package tests;


import base.BaseTest;
import org.junit.jupiter.api.Test;

public class GoogleTest extends BaseTest {

    @Test
    void openGoogle() {

        driver.get("https://google.com");
    }
}