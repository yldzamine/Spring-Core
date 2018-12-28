package com.amine;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.amine.config.Aconfig;
import com.amine.config.Bconfig;

@Configuration
@Import({Aconfig.class, Bconfig.class})
public class SpringBean {

}
