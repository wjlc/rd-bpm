/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.custom;

import org.activiti.engine.cfg.AbstractProcessEngineConfigurator;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;

import java.util.HashMap;
import java.util.Map;

public class CustomConfigurator extends AbstractProcessEngineConfigurator {


    protected String initialContextFactory = "com.sun.jndi.ldap.LdapCtxFactory";
    protected String securityAuthentication = "simple";

    // For parameters like connection pooling settings, etc.
    private Map<String, String> customConnectionParameters = new HashMap<>();


    // Group caching
    protected int groupCacheSize = -1;
    protected long groupCacheExpirationTime = 3600000L; // default: one hour


    public void beforeInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
        // Nothing to do
    }

    public void configure(ProcessEngineConfigurationImpl processEngineConfiguration) {

        // User
        processEngineConfiguration.setUserEntityManager(new CustomUserEntityManager(processEngineConfiguration, this));

        // Groups
//        LDAPGroupCache ldapGroupCache = null;
//        if (getGroupCacheSize() > 0) {
//            ldapGroupCache = new LDAPGroupCache(getGroupCacheSize(), getGroupCacheExpirationTime(), processEngineConfiguration.getClock());
//            if (groupCacheListener != null) {
//                ldapGroupCache.setLdapCacheListener(groupCacheListener);
//            }
//        }

//        LDAPGroupManager ldapGroupManager = null;
//        if (ldapGroupCache == null) {
//            ldapGroupManager = new LDAPGroupManager(processEngineConfiguration, this);
//        } else {
//            ldapGroupManager = new LDAPGroupManager(processEngineConfiguration, this, ldapGroupCache);
//        }

        processEngineConfiguration.setGroupEntityManager(new CustomGroupEntityManager(processEngineConfiguration, this));
    }

}
