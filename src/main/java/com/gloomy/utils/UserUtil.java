package com.gloomy.utils;

import com.gloomy.beans.User;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Copyright © 2017 Gloomy
 * Created by Gloomy on 16-Apr-17.
 */
public final class UserUtil {
    private static final String AVATAR_UPLOAD_DIRECTORY = "avatar";
    private static final String STATIC_IMAGES_RESOURCE_PATH = "images";
    private static final String EMPTY_AVATAR_NAME = "face_sample.png";

    private UserUtil() {
        // No-op
    }

    public static String getUserAvatarPath(User user, HttpServletRequest request) {
        String avatarPath = String.format("%s%s%s", ServerInformationUtil.getURLWithContextPath(request), "/", AVATAR_UPLOAD_DIRECTORY);
        if (TextUtils.isEmpty(user.getAvatar())) {
            return String.format("%s%s%s%s%s", ServerInformationUtil.getURLWithContextPath(request), "/", STATIC_IMAGES_RESOURCE_PATH, "/", EMPTY_AVATAR_NAME);
        } else if (user.getAvatar().contains("http://") || user.getAvatar().contains("https://")) {
            return user.getAvatar();
        }
        return String.format("%s%s%s", avatarPath, "/", user.getAvatar());
    }
}
