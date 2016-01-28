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
	private String cachedFormattedNumber;
	private String cachedLookupUri;
	private String cachedMatchedNumber;
	private String cachedName;
	private String cachedNormalizedNumber;
	private String cachedNumberLabel;
	private String cachedNumberType;
	private String cachedPhotoId;
	private String cachedPhotoUri;
	private String contentItemType;
	private String contentType;
	private String countryIso;
	private String dataUsage;
	private String date;
	private String defaultSortOrder;
	private String duration;
	private String extraCallTypeFilter;
	private String features;
	private String featuresVideo;
	private String geocodedLocation;
	private int incomingType;
	private boolean isRead;
	private String limitParamKey;
	private int missedType;
	private boolean isNew;
	private String number;
	private String numberPresentation;
	private String offsetParamKey;
	private int outgoingType;
	private String phoneAccountComponentName;
	private String phoneAccountId;
	private int presentationAllowed;
	private int presentationPayphone;
	private int presentationRestricted;
	private int presentationUnknown;
	private String transcription;
	private String type;
	private int voicemailType;
	private String voicemailUri;
}
