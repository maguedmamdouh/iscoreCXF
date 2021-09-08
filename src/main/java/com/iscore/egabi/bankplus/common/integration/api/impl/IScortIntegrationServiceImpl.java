package com.iscore.egabi.bankplus.common.integration.api.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iscore.egabi.bankplus.common.integration.api.IScortIntegrationService;
import com.iscore.egabi.bankplus.common.integration.configuration.IntegrationBeanConfiguration;
import com.iscore.egabi.bankplus.common.integration.configuration.IntegrationService;


/**
 * @author Aya Yasser
 * @date 12/8/2020
 */

@Service
public class IScortIntegrationServiceImpl implements IScortIntegrationService {
    private Logger logger = LogManager.getLogger(IScortIntegrationServiceImpl.class);

    @Autowired
    IntegrationService integrationService;
    
    
    @Override
    public String getIscoreInfoByCustomer(String request,String userId,String password) {

            String beanId=IntegrationBeanConfiguration.ISCORE_INTEGRATION.getId();
            org.tempuri.LiveRequestInvokerSoap liveRequestInvoker = (org.tempuri.LiveRequestInvokerSoap) integrationService.integrate(beanId).create();
            String response=null;
        try {
            response=liveRequestInvoker.postRequest(request, userId, password);
        }
        catch (Exception ex){
            logger.error("Network error");
        }
        return response;
    }
}
