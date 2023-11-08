package com.example.securityspringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SecuritySpringBootApplicationTests {

    @Test
    public void testBCrypt(){

        //对密码进行加密
        String hashpw = BCrypt.hashpw("secret", BCrypt.gensalt());
        System.out.println(hashpw);

        //校验密码
        boolean checkpw = BCrypt.checkpw("123", "$2a$10$8gQuPoh8JJV1LK8vM2HfI.2Moa4m7YaY5El6F13JufU560H6cDGb2");
        boolean checkpw2 = BCrypt.checkpw("123", "$2a$10$BHL8XKsS3/1wwxsKNlDLM.Uu2Qmw2fggVVXGGzYbq5THKXPX78v8C");
        System.out.println(checkpw);
        System.out.println(checkpw2);
    }

}
