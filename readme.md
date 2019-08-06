dm7-healthprovider-demo
=======================

Decision Manager Demo

Execute Cancellation Rule with the following payload:

{
    "commands": [
        {
            "insert": {
                "object": {
                    "com.myspace.spectrum.Patient": {
                        "age": 50,
                        "hasUsedPortal": true,
                        "isAdmitted": true,
                        "isPregnant": false,
                        "hasDisability": false,
                        "notifyOfValetServices": false,
                        "offerCancellation": false,
                        "appointment": {
                        	"scheduled": true,
                        	"date": "2019-08-07",
                        	"facility": {
                        		"hasValet": true
                        	}
                        }
                    }
                },
                "out-identifier": "patient",
                "return-object": true
            }
        },
        {
            "fire-all-rules": {
                "out-identifier": "firedActivations"
            }
        },
        {
            "get-objects": {
                "out-identifier": "facts"
            }
        }
    ]
}

Execute both Cancellation rule and Valet Services rule with the following payload:

{
    "commands": [
        {
            "insert": {
                "object": {
                    "com.myspace.spectrum.Patient": {
                        "age": 50,
                        "hasUsedPortal": true,
                        "isAdmitted": true,
                        "isPregnant": false,
                        "hasDisability": true,
                        "notifyOfValetServices": false,
                        "offerCancellation": false,
                        "appointment": {
                        	"scheduled": true,
                        	"date": "2019-08-08",
                        	"facility": {
                        		"hasValet": true
                        	}
                        }
                    }
                },
                "out-identifier": "patient",
                "return-object": true
            }
        },
        {
            "fire-all-rules": {
                "out-identifier": "firedActivations"
            }
        },
        {
            "get-objects": {
                "out-identifier": "facts"
            }
        }
    ]
}
