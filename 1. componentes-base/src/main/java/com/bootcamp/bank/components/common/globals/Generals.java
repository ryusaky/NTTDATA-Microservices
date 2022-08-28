package com.bootcamp.bank.components.common.globals;

public class Generals {

	public static class ErrorCodes {
		public final short MODEL_INVALID = 9001;
		public final short KEY_INVALID = 9002;
		public final short NO_EXIST_ENTITY = 9003;
		public final short INTERNAL_SERVER = 500;
		public final short NOT_AVAIBLE = 503;
		public final short ENTITY_DUPLICATE = 9004;
		public final short ENTITY_INTEGRITY = 9005;
		public final short NO_ADICIONAL_MESSAGE = 9006;
		public final short BUSINESS_VALIDATE = 9007;
	}

	public static class DefaultErrorMessages {
		public final String MODEL_INVALID = "The data not pass the required validations";
		public final String KEY_INVALID = "The format key not is correct";
		public final String NO_EXIST_ENTITY = "No found records for this value of key";
		public final String INTERNAL_SERVER = "Internal server error";
		public final String ENTITY_DUPLICATE = "Duplicate Entity, Existe other entity with the same data";
		public final String ENTITY_INTEGRITY = "No is possible delete";
		public final String NO_ADICIONAL_MESSAGE = "No adicional message";
		public final String BUSINESS_VALIDATE = "An error occurred when validating the model";
	}
	
	public static class FormatDates
    {
        public final String DB_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
        public final String DB_DATE = "yyyy-MM-dd";
        public final String LATIN_DATE = "dd/MM/yyyy";
        public final String LATIN_DATE_HOUR = "dd/MM/yyyy hh:mm";
        public final String LATIN_DATE_HOUR_24 = "dd/MM/yyyy HH:mm";
        public final String LATIN_DATE_TIME = "dd/MM/yyyy HH:mm:ss";
        public final String LATIN_TIME_HOUR_24 = "HH:mm";
        public final String LATIN_TIME_HOUR_SECOND_24 = "HH:mm:ss";
        public final String LATIN_TIME_HOUR_12 = "hh:mm tt";
        public final String LATIN_DATE_TIME_FFF = "dd/MM/yyyy HH:mm:ss.fff";
    }

}
