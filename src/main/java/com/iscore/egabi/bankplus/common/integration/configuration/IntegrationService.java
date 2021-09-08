package com.iscore.egabi.bankplus.common.integration.configuration;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @Author Aya Yasser
 * @date 12/14/2020
 */
public interface IntegrationService {
    JaxWsProxyFactoryBean integrate(String beanId);
}
