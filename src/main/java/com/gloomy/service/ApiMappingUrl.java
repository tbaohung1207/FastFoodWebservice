package com.gloomy.service;

/**
 * Copyright © 2017 Gloomy
 * Created by Gloomy on 18-Mar-17.
 */
public class ApiMappingUrl {
    /**
     * Base URL
     */
    public static final String API_BASE_URL = "/v1/api";
    public static final String API_BASIC_URL = API_BASE_URL + "/basic";
    public static final String API_AUTH_URL = API_BASE_URL + "/auth";

    /**
     * Authorization URL
     */
    public static final String OAUTH_API_URL = "/v1/api/oauth";
    public static final String LOGIN_USER_API_URL = "/login";
    public static final String LOGIN_USER_FACEBOOK_API_URL = "/facebook";
    public static final String REFRESH_TOKEN_URL = "/refresh";
    public static final String LOGOUT_USER_API_URL = "/logout";
    public static final String REGISTER_USER_API_URL = "/register";
    public static final String REGISTRATION_CONFIRM = "/registrationConfirm";
    public static final String RESEND_CONFIRMATION = "/resendConfirmation";

    /**
     * Endpoint URL
     */
    public static final String MY_PROFILE_ENDPOINT = "/profile";
    public static final String FOOD_ENDPOINT = "/food";
    public static final String IMAGE_ENDPOINT = "/image";
    public static final String PLACE_ENDPOINT = "/place";
    public static final String LOCATION_ENDPOINT = "/location";
    public static final String USER_ENDPOINT = "/user";
    public static final String TOPIC_ENDPOINT = "/topic";

    /**
     * RestService For App URL
     */
    public static final String HOME = "/home";
    public static final String SEARCH = "/search";
    public static final String RATING = "/rating";
    public static final String HOT = "/hot";
    public static final String TRENDING = "/trending";
    public static final String FRESH = "/fresh";
    public static final String RANDOM = "/random";
    public static final String USER_FAVORITE = "/favorite";
    public static final String USER_FEEDS = "/feeds";
    public static final String COMMENT = "/comment";
    public static final String LIKE = "/like";
    public static final String DELETE_COMMENT = "/delete-comment";
    public static final String PROVINCE = "/province";
    public static final String FIND = "/find";
    public static final String EDIT_PROFILE = "/edit-profile";
    public static final String FILE = "/files";
}
