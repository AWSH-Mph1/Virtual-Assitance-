//package com.mphasis.virtual.pax.assitant.config;
//
//import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.util.StringUtils;
//import com.amazonaws.auth.AWSCredentials;
//import com.amazonaws.auth.AWSCredentialsProvider;
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.regions.Regions;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
//import com.amazonaws.services.dynamodbv2.document.DynamoDB;
//
//@Configuration
//public class DynamoDBConfig {
//
//	@Value("${aws.access_key_id}")
//	private String awsId;
// 
//	@Value("${aws.secret_access_key}")
//	private String awsKey;
//
//    @Value("${s3.region}")
//	private String region;
//
//	@Bean
//	public AmazonDynamoDB s3client() {
//		
//		BasicAWSCredentials awsCreds = new BasicAWSCredentials(awsId, awsKey);
//		AmazonDynamoDB  s3Client = AmazonDynamoDBClientBuilder.standard()
//								.withRegion(Regions.fromName(region))
//		                        .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
//		                        .build();
//		return s3Client;
//	}
//}
