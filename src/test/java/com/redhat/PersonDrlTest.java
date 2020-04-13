package com.redhat;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * PersonDrlTest
 */
public class PersonDrlTest {


    @Test
    public void testPersonDrl() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession();

        Person duncan = new Person();
        duncan.setName("Duncan");
        duncan.setAge(41);

        kieSession.insert(duncan);
        kieSession.fireAllRules();
        kieSession.dispose();
    }
    




}