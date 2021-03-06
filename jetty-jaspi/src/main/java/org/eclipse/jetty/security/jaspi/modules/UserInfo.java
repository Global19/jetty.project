//
// ========================================================================
// Copyright (c) 1995-2021 Mort Bay Consulting Pty Ltd and others.
//
// This program and the accompanying materials are made available under the
// terms of the Eclipse Public License v. 2.0 which is available at
// https://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
// which is available at https://www.apache.org/licenses/LICENSE-2.0.
//
// SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
// ========================================================================
//

package org.eclipse.jetty.security.jaspi.modules;

import java.util.Arrays;

public class UserInfo
{
    private final String userName;

    private char[] password;

    public UserInfo(String userName, char[] password)
    {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName()
    {
        return userName;
    }

    public char[] getPassword()
    {
        return password;
    }

    public void clearPassword()
    {
        Arrays.fill(password, (char)0);
        password = null;
    }
}
