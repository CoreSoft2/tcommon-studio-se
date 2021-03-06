package org.talend.core.model.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class TalendTextUtilsTest {

    @Test
    public void testHidePassword(){
        String pass = "((String) globalMap(\"myPasswd\"))";
        String result = TalendTextUtils.hidePassword(pass);
        assertEquals(result,pass);
        
        String temp = "ccc";
        pass = "\"aaa\""+temp+"\"bbb\"";
        result = TalendTextUtils.hidePassword(pass);
        assertEquals(result,pass);
        
        pass = " value ";
        result = TalendTextUtils.hidePassword(pass);
        assertEquals(result,"*********");
        
        pass = " va  lue ";
        result = TalendTextUtils.hidePassword(pass);
        assertEquals(result,"***********");
        
        pass = null;
        result = TalendTextUtils.hidePassword(pass);
        assertEquals(result,"**");
        
        pass = " ";
        result = TalendTextUtils.hidePassword(pass);
        assertEquals(result,"***");
        
        pass = "\"\"";
        result = TalendTextUtils.hidePassword(pass);
        assertEquals(result,"****");
        
        pass = "\"  \"";
        result = TalendTextUtils.hidePassword(pass);
        assertEquals(result,"******");
        
    }


}
