package com.enrique.phoneusage.models;

import lombok.Data;

/**
 * Created by enriquelopezmanas on 1/28/16.
 */
@Data
public class Calls {
	private String cached_formatted_number;
	private String cached_lookup_uri;
	private String cached_matched_number;
	private String cached_name;
	private String cached_normalized_number;
	private String cached_number_label;
	private String cached_number_type;
	private String cached_photo_id;
	private String cached_photo_uri;
	private String content_item_type;
	private String content_type;
	private String country_iso;
	private String data_usage;
	private String date;
	private String default_sort_order;
	private String duration;
	private String extra_call_type_filter;
	private String features;
	private String features_video;
	private String geocoded_location;
	private int incoming_type;
	private boolean is_read;
	private String limit_param_key;
	private int missed_type;
	private boolean is_new;
	private String number;
	private String number_presentation;
	private String offset_param_key;
	private int outgoing_type;
	private String phone_account_component_name;
	private String phone_account_id;
	private int presentation_allowed;
	private int presentation_payphone;
	private int presentation_restricted;
	private int presentation_unknown;
	private String transcription;
	private String type;
	private int voicemail_type;
	private String voicemail_uri;
}
