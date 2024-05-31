package com.nt.document;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document(collection = "PLAYER_INFO")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class PlayerInfo {


	@Id
	private Integer pno;
	@NonNull
	private String pname;
	@NonNull
	private String padds;
	@NonNull
	private List<String> nickNames;
	@NonNull
	private String[] friends;
	@NonNull
	private Map<String,String> impKnocks;
	@NonNull
	private Properties idDetails;
	
}
