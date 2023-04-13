package com.example.fullstacktutorial.bucket;

public enum BucketName {
  PROFILE_IMAGE("full-stack-image-upload-123");

  private final String bucketName;

  BucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public String getBucketName() {
    return bucketName;
  }
}
