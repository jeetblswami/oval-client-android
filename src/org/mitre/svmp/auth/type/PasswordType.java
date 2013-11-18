/*
 Copyright 2013 The MITRE Corporation, All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this work except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package org.mitre.svmp.auth.type;

import android.content.Context;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import org.mitre.svmp.auth.module.IAuthModule;
import org.mitre.svmp.auth.module.PasswordModule;
import org.mitre.svmp.protocol.SVMPProtocol.AuthRequest;

/**
 * @author Joe Portner
 */
public class PasswordType implements IAuthType {
    public int getID() {
        return PasswordModule.AUTH_MODULE_ID;
    }

    public String getDescription() {
        return "Password";
    }
}