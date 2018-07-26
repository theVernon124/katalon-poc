<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Post Checkout</name>
   <tag></tag>
   <elementGuidId>c9d887eb-ae2d-483f-89e0-d160071ab755</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;totalAmount\&quot;: {\n    \&quot;currency\&quot;: \&quot;${currency}\&quot;,\n    \&quot;value\&quot;: \&quot;6404.90\&quot;,\n    \&quot;details\&quot;: {\n      \&quot;discount\&quot;: \&quot;300.00\&quot;,\n      \&quot;serviceCharge\&quot;: \&quot;50.00\&quot;,\n      \&quot;shippingFee\&quot;: \&quot;200.00\&quot;,\n      \&quot;tax\&quot;: \&quot;691.60\&quot;,\n      \&quot;subtotal\&quot;: \&quot;5763.30\&quot;\n    }\n  },\n  \&quot;buyer\&quot;: {\n    \&quot;firstName\&quot;: \&quot;Juan\&quot;,\n    \&quot;middleName\&quot;: \&quot;dela\&quot;,\n    \&quot;lastName\&quot;: \&quot;Cruz\&quot;,\n    \&quot;contact\&quot;: {\n      \&quot;phone\&quot;: \&quot;+63(2)1234567890\&quot;,\n      \&quot;email\&quot;: \&quot;paymayabuyer1@gmail.com\&quot;\n    },\n    \&quot;shippingAddress\&quot;: {\n      \&quot;line1\&quot;: \&quot;9F Robinsons Cybergate 3\&quot;,\n      \&quot;line2\&quot;: \&quot;Pioneer Street\&quot;,\n      \&quot;city\&quot;: \&quot;Mandaluyong City\&quot;,\n      \&quot;state\&quot;: \&quot;Metro Manila\&quot;,\n      \&quot;zipCode\&quot;: \&quot;12345\&quot;,\n      \&quot;countryCode\&quot;: \&quot;PH\&quot;\n    },\n    \&quot;billingAddress\&quot;: {\n      \&quot;line1\&quot;: \&quot;9F Robinsons Cybergate 3\&quot;,\n      \&quot;line2\&quot;: \&quot;Pioneer Street\&quot;,\n      \&quot;city\&quot;: \&quot;Mandaluyong City\&quot;,\n      \&quot;state\&quot;: \&quot;Metro Manila\&quot;,\n      \&quot;zipCode\&quot;: \&quot;12345\&quot;,\n      \&quot;countryCode\&quot;: \&quot;PH\&quot;\n    },\n    \&quot;ipAddress\&quot;: \&quot;125.60.148.241\&quot;\n  },\n  \&quot;items\&quot;: [\n    {\n      \&quot;name\&quot;: \&quot;Canvas Slip Ons\&quot;,\n      \&quot;code\&quot;: \&quot;CVG-096732\&quot;,\n      \&quot;description\&quot;: \&quot;Shoes\&quot;,\n      \&quot;quantity\&quot;: \&quot;3\&quot;,\n      \&quot;amount\&quot;: {\n        \&quot;value\&quot;: \&quot;1621.10\&quot;,\n        \&quot;details\&quot;: {\n          \&quot;discount\&quot;: \&quot;100.00\&quot;,\n          \&quot;subtotal\&quot;: \&quot;1721.10\&quot;\n        }\n      },\n      \&quot;totalAmount\&quot;: {\n        \&quot;value\&quot;: \&quot;4863.30\&quot;,\n        \&quot;details\&quot;: {\n          \&quot;discount\&quot;: \&quot;300.00\&quot;,\n          \&quot;subtotal\&quot;: \&quot;5163.30\&quot;\n        }\n      }\n    },\n    {\n      \&quot;name\&quot;: \&quot;PU Ballerina Flats\&quot;,\n      \&quot;code\&quot;: \&quot;CVR-096RE2\&quot;,\n      \&quot;description\&quot;: \&quot;Shoes\&quot;,\n      \&quot;quantity\&quot;: \&quot;1\&quot;,\n      \&quot;amount\&quot;: {\n        \&quot;value\&quot;: \&quot;600.00\&quot;\n      },\n      \&quot;totalAmount\&quot;: {\n        \&quot;value\&quot;: \&quot;600.00\&quot;\n      }\n    }\n  ],\n  \&quot;redirectUrl\&quot;: {\n    \&quot;success\&quot;: \&quot;http://www.askthemaya.com/\&quot;,\n    \&quot;failure\&quot;: \&quot;http://www.askthemaya.com/failure?id\u003d6319921\&quot;,\n    \&quot;cancel\&quot;: \&quot;http://www.askthemaya.com/cancel?id\u003d6319921\&quot;\n  },\n  \&quot;requestReferenceNumber\&quot;: \&quot;000141386713\&quot;,\n  \&quot;metadata\&quot;: {}\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic cGstblJPN2NsU2ZKcm9qdVJtU2hxUmJpaEtQTGRHZUNuYjl3aUlXRjhtZUpFOTo=</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://pg-sandbox.paymaya.com/checkout/v1/checkouts</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
