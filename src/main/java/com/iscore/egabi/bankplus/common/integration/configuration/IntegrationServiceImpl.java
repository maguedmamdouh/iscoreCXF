package com.iscore.egabi.bankplus.common.integration.configuration;


import com.iscore.egabi.bankplus.common.services.error.BpException;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * @Author Aya Yasser
 * @date 12/14/2020
 */
@Service
@PropertySource("classpath:application.properties")
public class IntegrationServiceImpl implements IntegrationService {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private Environment env;

    @Override
    public JaxWsProxyFactoryBean integrate(String beanId) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        try {
            IntegrationBeanConfiguration intgBean=IntegrationBeanConfiguration.mapIdToBean(beanId);
            factory.setServiceClass(intgBean.getClazz());
           // String address=CustomAppConfiguration.getProperty(intgBean.getBeanName()+Constants.SERVICE_URL_SUFFIX);
            factory.setAddress(getAddress(intgBean.getBeanName()));
            factory.getInInterceptors().add(new org.apache.cxf.interceptor.LoggingInInterceptor());
            factory.getOutInterceptors().add(new org.apache.cxf.interceptor.LoggingOutInterceptor());
        } catch (BpException e) {
            e.printStackTrace();
        }
        return factory;
    }
    private String getAddress(String lookupKey){
        String address="";
         try{
             address= env.getProperty(lookupKey+".url");
         }catch (Exception e){
             LOGGER.error(e.getMessage());
         }
         return address;
    }
}
