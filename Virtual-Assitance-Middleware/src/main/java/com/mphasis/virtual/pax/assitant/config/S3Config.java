package com.mphasis.virtual.pax.assitant.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.rekognition.AmazonRekognition;
import com.amazonaws.services.rekognition.AmazonRekognitionClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
 
@Configuration
public class S3Config {
	@Value("${aws.access_key_id}")
	private String awsId;
 
	@Value("${aws.secret_access_key}")
	private String awsKey;
	
	@Value("${s3.region}")
	private String region;

	@Bean
	public AmazonS3 s3client() {
		
		BasicAWSCredentials awsCreds = new BasicAWSCredentials(awsId, awsKey);
		AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
								.withRegion(Regions.fromName(region))
		                        .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
		                        .build();
		return s3Client;
	}
	
	
	@Bean
	public AmazonRekognition s3rekognitionclient() {
		
		BasicAWSCredentials awsCreds = new BasicAWSCredentials(awsId, awsKey);
		AmazonRekognition rekognitionClient = AmazonRekognitionClientBuilder.standard().withRegion(region).
				 withCredentials(new AWSStaticCredentialsProvider(awsCreds)).build();
		
		return rekognitionClient;
	}
	
	@Bean
	public AmazonDynamoDB dynamoDbclient() {
		
		BasicAWSCredentials awsCreds = new BasicAWSCredentials(awsId, awsKey);
		AmazonDynamoDB  dbClient = AmazonDynamoDBClientBuilder.standard()
								.withRegion(Regions.fromName(region))
		                        .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
		                        .build();
		return dbClient;
	}
	 
}