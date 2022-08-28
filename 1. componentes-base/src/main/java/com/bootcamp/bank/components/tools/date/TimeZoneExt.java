package com.bootcamp.bank.components.tools.date;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeZoneExt {

	public static LocalDateTime ToAmericaLima() {
		return LocalDateTime.now(ZoneId.of("America/Lima"));
	}
}
