/**
 * PhoneUsage v0.1 for Android
 *
 * @Author: Enrique López Mañas <eenriquelopez@gmail.com>
 * http://www.lopez-manas.com
 * @copyright: Enrique López Mañas
 * @license: Apache License 2.0
 */

package com.enrique.phoneusage.models;

import lombok.Data;

@Data
public class Call {
	private String number;
	private String voicemailUri;
	private String features;
	private boolean newCall;
	private String formattedNumber;
	private String numberType;
	private String date;
	private String durationType;
	private String duration;
	private String dataUsage;
	private String presentation;
	private String numberLabel;
	private String geocodedLocation;
	private String lookupUri;
	private String countryIso;
	private String transcription;
	private String subscriptionComponentName;
	private String name;
	private String matchedNumber;
	private String subscriptionId;
	private String photoId;
	private String normalizedNumber;
	private String id;
	private String type;
	private boolean read;

}
