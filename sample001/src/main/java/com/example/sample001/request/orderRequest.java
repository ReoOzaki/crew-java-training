package com.example.sample001.request;

import java.sql.Date;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class orderRequest {
	
	//個数のバリテーション
		@NotBlank(message = "個数を入力してください")
		@Min(value = 1, message = "個数は1以上を入力してください")
		private int parts_count;
		
		@NotBlank(message = "型番を入力してください")
		private String parts_id;
		
		@NotNull(message = "日付を入力してください")
		private Date parts_day;
		
		@NotBlank(message = "コメントを入力してください")
		private String patrs_comment;
		
		//--getter:setter--
		
		public int getParts_count() {
			return parts_count;
		}
		
		public void setParts_count(int parts_count) {
			this.parts_count = parts_count;
		}

		public String getParts_id() {
			return parts_id;
		}

		public void setParts_id(String parts_id) {
			this.parts_id = parts_id;
		}

		public Date getParts_day() {
			return parts_day;
		}

		public void setParts_day(Date parts_day) {
			this.parts_day = parts_day;
		}

		public String getPatrs_comment() {
			return patrs_comment;
		}

		public void setPatrs_comment(String patrs_comment) {
			this.patrs_comment = patrs_comment;
		}

		
		

}
