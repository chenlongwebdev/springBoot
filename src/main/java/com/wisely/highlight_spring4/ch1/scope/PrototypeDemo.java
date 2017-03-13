package com.wisely.highlight_spring4.ch1.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class PrototypeDemo {

}
