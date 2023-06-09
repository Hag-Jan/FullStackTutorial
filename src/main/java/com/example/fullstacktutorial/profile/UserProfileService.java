package com.example.fullstacktutorial.profile;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

  private final UserProfileDataAccessService userProfileDataAccessService;

  @Autowired
  public UserProfileService(UserProfileDataAccessService userProfileDataAccessService) {
    this.userProfileDataAccessService = userProfileDataAccessService;
  }

  List<UserProfile> getUserProfile() {
    return userProfileDataAccessService.getUserProfile();
  }
}
