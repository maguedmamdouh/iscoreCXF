package com.iscore.egabi.controllers;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iscore.egabi.bankplus.common.integration.api.impl.IScortIntegrationServiceImpl;

@RestController
public class IscoreController {
	
	
	@Autowired 
	IScortIntegrationServiceImpl iScortIntegrationServiceImpl ;
	
	private Logger logger = LogManager.getLogger(IscoreController.class);
	
	
	@GetMapping("/")
	public void getIscore() {
		String request = "1:01\n" +
				"<![CDATA[<REQUEST REQUEST_ID=\"1\">\n" +
				"    <REQUEST_PARAMETERS>\n" +
				"        <REPORT_PARAMETERS REPORT_ID=\"3004\" SUBJECT_TYPE=\"1\" RESPONSE_TYPE=\"1\" LANGUAGE=\"002\" />\n" +
				"        <INQUIRY_REASON CODE=\"1\" />\n" +
				"        <APPLICATION PRODUCT=\"019\" LOAN-ACC-NO=\"\" BANK-NAME=\"\" BRANCH-CODE=\"\" NUMBER=\"1740012\" DATE=\"01/09/2019\" AMOUNT=\"25000\" CURRENCY=\"EGP\" />\n" +
				"    </REQUEST_PARAMETERS>\n" +
				"    <SEARCH_PARAMETERS>\n" +
				"        <NAME>\n" +
				"            <INDIVIDUAL FIRST-NAME=\"رجب\" MIDDLE-NAME=\"دندراوى\" LAST-NAME=\"درغام\" />\n" +
				"        </NAME>\n" +
				"        <IDENTIFIERS>\n" +
				"            <IDENTIFIER IDSOURCE=\"003\" IDVALUE=\"26511102100037\" />\n" +
				"        </IDENTIFIERS>\n" +
				"        <SURROGATES>\n" +
				"            <GENDER VALUE=\"001\" />\n" +
				"            <DOB VALUE=\"10/11/1965\" />\n" +
				"        </SURROGATES>\n" +
				"        <ADDRESS TYPE=\"001\">\n" +
				"            <BUILDING-NAME />\n" +
				"            <BUILDING-NUMBER />\n" +
				"            <STREET />\n" +
				"            <AREA />\n" +
				"            <CITY />\n" +
				"            <PO-BOX-NO />\n" +
				"            <GOVERNORATE />\n" +
				"            <ZIP-CODE />\n" +
				"            <E-MAIL />\n" +
				"            <PHONE />\n" +
				"        </ADDRESS>\n" +
				"    </SEARCH_PARAMETERS>\n" +
				"</REQUEST>]]>" ;
		String response = iScortIntegrationServiceImpl.getIscoreInfoByCustomer(request, "mf0002001300013ac", "Password2030");
		
		logger.log(Level.DEBUG, response);
	}

}
