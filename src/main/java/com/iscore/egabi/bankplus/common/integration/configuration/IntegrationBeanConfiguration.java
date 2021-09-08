package com.iscore.egabi.bankplus.common.integration.configuration;


import com.iscore.egabi.bankplus.common.services.error.BpException;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Aya Yasser
 * @date 12/14/2020
 */
public enum IntegrationBeanConfiguration {

    ISCORE_INTEGRATION("iscore",org.tempuri.LiveRequestInvokerSoap.class,"iscoreIntegrationBean");

    private String id;
    private Class<?> clazz;
    private String beanName;

    private static final Map<String, IntegrationBeanConfiguration> lookup = new HashMap<String, IntegrationBeanConfiguration>();

    static {
        for (IntegrationBeanConfiguration intgBean : IntegrationBeanConfiguration.values()) {
            lookup.put(intgBean.getId().toUpperCase(), intgBean);
        }
    }

    IntegrationBeanConfiguration(String id, Class clazz, String beanName){
        this.id = id;
        this.clazz = clazz;
        this.beanName = beanName;
    }

    public String getId() {
        return id;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public String getBeanName() {
        return beanName;
    }



    public static Map<String, IntegrationBeanConfiguration> getLookup() {
        return lookup;
    }
    public static IntegrationBeanConfiguration mapIdToBean(String id) throws BpException {
        if (lookup.containsKey(id.toUpperCase())) {
            return lookup.get(id.toUpperCase());
        }
        else
            throw new BpException("Error in integration bean");
    }
}
