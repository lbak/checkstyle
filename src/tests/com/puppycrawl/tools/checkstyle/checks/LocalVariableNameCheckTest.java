package com.puppycrawl.tools.checkstyle.checks;

import com.puppycrawl.tools.checkstyle.BaseCheckTestCase;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;

public class LocalVariableNameCheckTest
    extends BaseCheckTestCase
{
    public void testDefault()
        throws Exception
    {
        final DefaultConfiguration checkConfig =
            createCheckConfig(LocalVariableNameCheck.class);
        final String[] expected = {
            "119:13: Name 'ABC' must match pattern '^[a-z][a-zA-Z0-9]*$'.",
            "130:18: Name 'I' must match pattern '^[a-z][a-zA-Z0-9]*$'.",
            "132:20: Name 'InnerBlockVariable' must match pattern '^[a-z][a-zA-Z0-9]*$'.",
        };
        verify(checkConfig, getPath("InputSimple.java"), expected);
    }
}
