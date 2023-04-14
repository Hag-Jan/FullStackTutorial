package com.example.fullstacktutorial.profile;

import com.example.fullstacktutorial.datastore.FakeUserProfileDataStore;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserProfileDataAccessService {

  private final FakeUserProfileDataStore fakeUserProfileDataStore;

  @Autowired
  public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserProfileDataStore) {
    this.fakeUserProfileDataStore = fakeUserProfileDataStore;
  }

  List<UserProfile> getUserProfile() {
    return fakeUserProfileDataStore.getUserProfiles();
  }
}
