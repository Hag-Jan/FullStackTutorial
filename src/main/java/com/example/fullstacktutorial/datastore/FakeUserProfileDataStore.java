package com.example.fullstacktutorial.datastore;

import com.example.fullstacktutorial.profile.UserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public class FakeUserProfileDataStore {

  private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

  static {
    USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "janetjones", null));
    USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "antoniojunior", null));


  }

  public List<UserProfile> getUserProfiles() {
    return USER_PROFILES;
  }

}
