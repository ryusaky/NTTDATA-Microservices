package com.bootcamp.bank.components.common.globals;

public class Generals {

	public static class ErrorCodes {
		public static final short MODEL_INVALID = 9001;
		public static final short KEY_INVALID = 9002;
		public static final short NO_EXIST_ENTITY = 9003;
		public static final short INTERNAL_SERVER = 500;
		public static final short NOT_AVAIBLE = 503;
		public static final short ENTITY_DUPLICATE = 9004;
		public static final short ENTITY_INTEGRITY = 9005;
		public static final short NO_ADICIONAL_MESSAGE = 9006;
		public static final short BUSINESS_VALIDATE = 9007;
	}

	public static class DefaultErrorMessages {
		public static final String MODEL_INVALID = "The data not pass the required validations";
		public static final String KEY_INVALID = "The format key not is correct";
		public static final String NO_EXIST_ENTITY = "No found records for this value of key";
		public static final String INTERNAL_SERVER = "Internal server error";
		public static final String ENTITY_DUPLICATE = "Duplicate Entity, Existe other entity with the same data";
		public static final String ENTITY_INTEGRITY = "No is possible delete";
		public static final String NO_ADICIONAL_MESSAGE = "No adicional message";
		public static final String BUSINESS_VALIDATE = "An error occurred when validating the model";
	}

	public static class FormatDates {
		public static final String DB_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
		public static final String DB_DATE = "yyyy-MM-dd";
		public static final String LATIN_DATE = "dd/MM/yyyy";
		public static final String LATIN_DATE_HOUR = "dd/MM/yyyy hh:mm";
		public static final String LATIN_DATE_HOUR_24 = "dd/MM/yyyy HH:mm";
		public static final String LATIN_DATE_TIME = "dd/MM/yyyy HH:mm:ss";
		public static final String LATIN_TIME_HOUR_24 = "HH:mm";
		public static final String LATIN_TIME_HOUR_SECOND_24 = "HH:mm:ss";
		public static final String LATIN_TIME_HOUR_12 = "hh:mm tt";
		public static final String LATIN_DATE_TIME_FFF = "dd/MM/yyyy HH:mm:ss.fff";
	}

	public static class PathUrl {
		public static final String GET_ALL = "/getall";
		public static final String GET_BY_ID = "/get";
		public static final String ADD = "/add";
		public static final String UPDATE = "/update";
		public static final String DELETE = "/delete";
	}
}
