package com.example.fullstacktutorial.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;


public class UserProfile {

  private UUID userProfileId;
  private String userName;
  private String userProfileImageLink; //S3 key

  public UserProfile(UUID userProfileId, String userName, String userProfileImageLink) {
    this.userProfileId = userProfileId;
    this.userName = userName;
    this.userProfileImageLink = userProfileImageLink;
  }

  public Optional<String> getUserProfileImageLink() {
    return Optional.ofNullable(userProfileImageLink);
  }

  public void setUserProfileImageLink(String userProfileImageLink) {
    this.userProfileImageLink = userProfileImageLink;
  }

  public UUID getUserProfileId() {
    return userProfileId;
  }

  public void setUserProfileId(UUID userProfileId) {
    this.userProfileId = userProfileId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile that = (UserProfile) o;
    return Objects.equals(userProfileId, that.userProfileId) &&
        Objects.equals(userName, that.userName)
        && Objects.equals(userProfileImageLink, that.userProfileImageLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userProfileId, userName, userProfileImageLink);
  }
}
