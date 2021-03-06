/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package griffon.plugins.typicons;

import javax.annotation.Nonnull;

import static griffon.util.GriffonNameUtils.requireNonBlank;

/**
 * @author Andres Almiray
 */
public enum TypIconFont {
    // latest is e14f
    ADJUST_BRIGHTNESS("adjust-brightness", '\ue000'),
    ADJUST_CONTRAST("adjust-contrast", '\ue001'),
    ANCHOR("anchor", '\ue003'),
    ANCHOR_OUTLINE("anchor-outline", '\ue002'),
    ARCHIVE("archive", '\ue004'),
    ARROW_BACK("arrow-back", '\ue006'),
    ARROW_BACK_OUTLINE("arrow-back-outline", '\ue005'),
    ARROW_DOWN("arrow-down", '\ue009'),
    ARROW_DOWN_OUTLINE("arrow-down-outline", '\ue007'),
    ARROW_DOWN_THICK("arrow-down-thick", '\ue008'),
    ARROW_FORWARD("arrow-forward", '\ue00b'),
    ARROW_FORWARD_OUTLINE("arrow-forward-outline", '\ue00a'),
    ARROW_LEFT("arrow-left", '\ue00e'),
    ARROW_LEFT_OUTLINE("arrow-left-outline", '\ue00c'),
    ARROW_LEFT_THICK("arrow-left-thick", '\ue00d'),
    ARROW_LOOP("arrow-loop", '\ue010'),
    ARROW_LOOP_OUTLINE("arrow-loop-outline", '\ue00f'),
    ARROW_MAXIMISE("arrow-maximise", '\ue012'),
    ARROW_MAXIMISE_OUTLINE("arrow-maximise-outline", '\ue011'),
    ARROW_MINIMISE("arrow-minimise", '\ue014'),
    ARROW_MINIMISE_OUTLINE("arrow-minimise-outline", '\ue013'),
    ARROW_MOVE("arrow-move", '\ue016'),
    ARROW_MOVE_OUTLINE("arrow-move-outline", '\ue015'),
    ARROW_REPEAT("arrow-repeat", '\ue018'),
    ARROW_REPEAT_OUTLINE("arrow-repeat-outline", '\ue017'),
    ARROW_RIGHT("arrow-right", '\ue01b'),
    ARROW_RIGHT_OUTLINE("arrow-right-outline", '\ue019'),
    ARROW_RIGHT_THICK("arrow-right-thick", '\ue01a'),
    ARROW_SHUFFLE("arrow-shuffle", '\ue01c'),
    ARROW_SORTED_DOWN("arrow-sorted-down", '\ue01d'),
    ARROW_SORTED_UP("arrow-sorted-up", '\ue01e'),
    ARROW_SYNC("arrow-sync", '\ue020'),
    ARROW_SYNC_OUTLINE("arrow-sync-outline", '\ue01f'),
    ARROW_UNSORTED("arrow-unsorted", '\ue021'),
    ARROW_UP("arrow-up", '\ue024'),
    ARROW_UP_OUTLINE("arrow-up-outline", '\ue022'),
    ARROW_UP_THICK("arrow-up-thick", '\ue023'),
    AT("at", '\ue025'),
    ATTACHMENT("attachment", '\ue027'),
    ATTACHMENT_OUTLINE("attachment-outline", '\ue026'),
    BACKSPACE("backspace", '\ue029'),
    BACKSPACE_OUTLINE("backspace-outline", '\ue028'),
    BATTERY_CHARGE("battery-charge", '\ue02a'),
    BATTERY_FULL("battery-full", '\ue02b'),
    BATTERY_HIGH("battery-high", '\ue02c'),
    BATTERY_LOW("battery-low", '\ue02d'),
    BATTERY_MID("battery-mid", '\ue02e'),
    BEAKER("beaker", '\ue02f'),
    BEER("beer", '\ue030'),
    BELL("bell", '\ue031'),
    BOOK("book", '\ue032'),
    BOOKMARK("bookmark", '\ue033'),
    BRIEFCASE("briefcase", '\ue034'),
    BRUSH("brush", '\ue035'),
    BUSINESS_CARD("business-card", '\ue036'),
    CALCULATOR("calculator", '\ue037'),
    CALENDAR("calendar", '\ue039'),
    CALENDAR_OUTLINE("calendar-outline", '\ue038'),
    CAMERA("camera", '\ue03b'),
    CAMERA_OUTLINE("camera-outline", '\ue03a'),
    CANCEL("cancel", '\ue03d'),
    CANCEL_OUTLINE("cancel-outline", '\ue03c'),
    CHART_AREA("chart-area", '\ue03f'),
    CHART_AREA_OUTLINE("chart-area-outline", '\ue03e'),
    CHART_BAR("chart-bar", '\ue041'),
    CHART_BAR_OUTLINE("chart-bar-outline", '\ue040'),
    CHART_LINE("chart-line", '\ue043'),
    CHART_LINE_OUTLINE("chart-line-outline", '\ue042'),
    CHART_PIE("chart-pie", '\ue045'),
    CHART_PIE_OUTLINE("chart-pie-outline", '\ue044'),
    CHEVRON_LEFT("chevron-left", '\ue047'),
    CHEVRON_LEFT_OUTLINE("chevron-left-outline", '\ue046'),
    CHEVRON_RIGHT("chevron-right", '\ue049'),
    CHEVRON_RIGHT_OUTLINE("chevron-right-outline", '\ue048'),
    CLIPBOARD("clipboard", '\ue04a'),
    CLOUD_STORAGE("cloud-storage", '\ue04b'),
    CLOUD_STORAGE_OUTLINE("cloud-storage-outline", '\ue054'),
    CODE("code", '\ue04d'),
    CODE_OUTLINE("code-outline", '\ue04c'),
    COFFEE("coffee", '\ue04e'),
    COG("cog", '\ue050'),
    COG_OUTLINE("cog-outline", '\ue04f'),
    COMPASS("compass", '\ue051'),
    CONTACTS("contacts", '\ue052'),
    CREDIT_CARD("credit-card", '\ue053'),
    CSS3("css3", '\ue055'),
    DATABASE("database", '\ue056'),
    DELETE("delete", '\ue058'),
    DELETE_OUTLINE("delete-outline", '\ue057'),
    DEVICE_DESKTOP("device-desktop", '\ue059'),
    DEVICE_LAPTOP("device-laptop", '\ue05a'),
    DEVICE_PHONE("device-phone", '\ue05b'),
    DEVICE_TABLET("device-tablet", '\ue05c'),
    DIRECTIONS("directions", '\ue05d'),
    DIVIDE("divide", '\ue05f'),
    DIVIDE_OUTLINE("divide-outline", '\ue05e'),
    DOCUMENT("document", '\ue063'),
    DOCUMENT_ADD("document-add", '\ue060'),
    DOCUMENT_DELETE("document-delete", '\ue061'),
    DOCUMENT_TEXT("document-text", '\ue062'),
    DOWNLOAD("download", '\ue065'),
    DOWNLOAD_OUTLINE("download-outline", '\ue064'),
    DROPBOX("dropbox", '\ue066'),
    EDIT("edit", '\ue067'),
    EJECT("eject", '\ue069'),
    EJECT_OUTLINE("eject-outline", '\ue068'),
    EQUALS("equals", '\ue06b'),
    EQUALS_OUTLINE("equals-outline", '\ue06a'),
    EXPORT("export", '\ue06d'),
    EXPORT_OUTLINE("export-outline", '\ue06c'),
    EYE("eye", '\ue06f'),
    EYE_OUTLINE("eye-outline", '\ue06e'),
    FEATHER("feather", '\ue070'),
    FILM("film", '\ue071'),
    FILTER("filter", '\ue072'),
    FLAG("flag", '\ue074'),
    FLAG_OUTLINE("flag-outline", '\ue073'),
    FLASH("flash", '\ue076'),
    FLASH_OUTLINE("flash-outline", '\ue075'),
    FLOW_CHILDREN("flow-children", '\ue077'),
    FLOW_MERGE("flow-merge", '\ue078'),
    FLOW_PARALLEL("flow-parallel", '\ue079'),
    FLOW_SWITCH("flow-switch", '\ue07a'),
    FOLDER("folder", '\ue07e'),
    FOLDER_ADD("folder-add", '\ue07b'),
    FOLDER_DELETE("folder-delete", '\ue07c'),
    FOLDER_OPEN("folder-open", '\ue07d'),
    GIFT("gift", '\ue07f'),
    GLOBE("globe", '\ue081'),
    GLOBE_OUTLINE("globe-outline", '\ue080'),
    GROUP("group", '\ue083'),
    GROUP_OUTLINE("group-outline", '\ue082'),
    HEADPHONES("headphones", '\ue084'),
    HEART("heart", '\ue088'),
    HEART_FULL_OUTLINE("heart-full-outline", '\ue085'),
    HEART_HALF_OUTLINE("heart-half-outline", '\ue086'),
    HEART_OUTLINE("heart-outline", '\ue087'),
    HOME("home", '\ue08a'),
    HOME_OUTLINE("home-outline", '\ue089'),
    HTML5("html5", '\ue08b'),
    IMAGE("image", '\ue08d'),
    IMAGE_OUTLINE("image-outline", '\ue08c'),
    INFINITY("infinity", '\ue08f'),
    INFINITY_OUTLINE("infinity-outline", '\ue08e'),
    INFO("info", '\ue093'),
    INFO_LARGE("info-large", '\ue091'),
    INFO_LARGE_OUTLINE("info-large-outline", '\ue090'),
    INFO_OUTLINE("info-outline", '\ue092'),
    INPUT_CHECKED("input-checked", '\ue095'),
    INPUT_CHECKED_OUTLINE("input-checked-outline", '\ue094'),
    KEY("key", '\ue097'),
    KEYBOARD("keyboard", '\ue098'),
    KEY_OUTLINE("key-outline", '\ue096'),
    LEAF("leaf", '\ue099'),
    LIGHTBULB("lightbulb", '\ue09a'),
    LINK("link", '\ue09c'),
    LINK_OUTLINE("link-outline", '\ue09b'),
    LOCATION("location", '\ue0a0'),
    LOCATION_ARROW("location-arrow", '\ue09e'),
    LOCATION_ARROW_OUTLINE("location-arrow-outline", '\ue09d'),
    LOCATION_OUTLINE("location-outline", '\ue09f'),
    LOCK_CLOSED("lock-closed", '\ue0a2'),
    LOCK_CLOSED_OUTLINE("lock-closed-outline", '\ue0a1'),
    LOCK_OPEN("lock-open", '\ue0a4'),
    LOCK_OPEN_OUTLINE("lock-open-outline", '\ue0a3'),
    MAIL("mail", '\ue0a5'),
    MAP("map", '\ue0a6'),
    MEDIA_EJECT("media-eject", '\ue0a8'),
    MEDIA_EJECT_OUTLINE("media-eject-outline", '\ue0a7'),
    MEDIA_FAST_FORWARD("media-fast-forward", '\ue0aa'),
    MEDIA_FAST_FORWARD_OUTLINE("media-fast-forward-outline", '\ue0a9'),
    MEDIA_PAUSE("media-pause", '\ue0ac'),
    MEDIA_PAUSE_OUTLINE("media-pause-outline", '\ue0ab'),
    MEDIA_PLAY("media-play", '\ue0b0'),
    MEDIA_PLAY_OUTLINE("media-play-outline", '\ue0ad'),
    MEDIA_PLAY_REVERSE("media-play-reverse", '\ue0af'),
    MEDIA_PLAY_REVERSE_OUTLINE("media-play-reverse-outline", '\ue0ae'),
    MEDIA_RECORD("media-record", '\ue0b2'),
    MEDIA_RECORD_OUTLINE("media-record-outline", '\ue0b1'),
    MEDIA_REWIND("media-rewind", '\ue0b4'),
    MEDIA_REWIND_OUTLINE("media-rewind-outline", '\ue0b3'),
    MEDIA_STOP("media-stop", '\ue0b6'),
    MEDIA_STOP_OUTLINE("media-stop-outline", '\ue0b5'),
    MESSAGE("message", '\ue0b8'),
    MESSAGES("messages", '\ue0b9'),
    MESSAGE_TYPING("message-typing", '\ue0b7'),
    MICROPHONE("microphone", '\ue0bb'),
    MICROPHONE_OUTLINE("microphone-outline", '\ue0ba'),
    MINUS("minus", '\ue0bd'),
    MINUS_OUTLINE("minus-outline", '\ue0bc'),
    MORTAR_BOARD("mortar-board", '\ue0be'),
    NEWS("news", '\ue0bf'),
    NOTES("notes", '\ue0c1'),
    NOTES_OUTLINE("notes-outline", '\ue0c0'),
    PEN("pen", '\ue0c2'),
    PENCIL("pencil", '\ue0c3'),
    PHONE("phone", '\ue0c5'),
    PHONE_OUTLINE("phone-outline", '\ue0c4'),
    PI("pi", '\ue0c7'),
    PIN("pin", '\ue0c9'),
    PIN_OUTLINE("pin-outline", '\ue0c8'),
    PIPETTE("pipette", '\ue0ca'),
    PI_OUTLINE("pi-outline", '\ue0c6'),
    PLANE("plane", '\ue0cc'),
    PLANE_OUTLINE("plane-outline", '\ue0cb'),
    PLUG("plug", '\ue0cd'),
    PLUS("plus", '\ue0cf'),
    PLUS_OUTLINE("plus-outline", '\ue0ce'),
    POINT_OF_INTEREST("point-of-interest", '\ue0d1'),
    POINT_OF_INTEREST_OUTLINE("point-of-interest-outline", '\ue0d0'),
    POWER("power", '\ue0d3'),
    POWER_OUTLINE("power-outline", '\ue0d2'),
    PRINTER("printer", '\ue0d4'),
    PUZZLE("puzzle", '\ue0d6'),
    PUZZLE_OUTLINE("puzzle-outline", '\ue0d5'),
    RADAR("radar", '\ue0d8'),
    RADAR_OUTLINE("radar-outline", '\ue0d7'),
    REFRESH("refresh", '\ue0da'),
    REFRESH_OUTLINE("refresh-outline", '\ue0d9'),
    RSS("rss", '\ue0dc'),
    RSS_OUTLINE("rss-outline", '\ue0db'),
    SCISSORS("scissors", '\ue0de'),
    SCISSORS_OUTLINE("scissors-outline", '\ue0dd'),
    SHOPPING_BAG("shopping-bag", '\ue0df'),
    SHOPPING_CART("shopping-cart", '\ue0e0'),
    SOCIAL_AT_CIRCULAR("social-at-circular", '\ue0e1'),
    SOCIAL_DRIBBBLE("social-dribbble", '\ue0e3'),
    SOCIAL_DRIBBBLE_CIRCULAR("social-dribbble-circular", '\ue0e2'),
    SOCIAL_FACEBOOK("social-facebook", '\ue0e5'),
    SOCIAL_FACEBOOK_CIRCULAR("social-facebook-circular", '\ue0e4'),
    SOCIAL_FLICKR("social-flickr", '\ue0e7'),
    SOCIAL_FLICKR_CIRCULAR("social-flickr-circular", '\ue0e6'),
    SOCIAL_GITHUB("social-github", '\ue0e9'),
    SOCIAL_GITHUB_CIRCULAR("social-github-circular", '\ue0e8'),
    SOCIAL_GOOGLE_PLUS("social-google-plus", '\ue0eb'),
    SOCIAL_GOOGLE_PLUS_CIRCULAR("social-google-plus-circular", '\ue0ea'),
    SOCIAL_INSTAGRAM("social-instagram", '\ue0ed'),
    SOCIAL_INSTAGRAM_CIRCULAR("social-instagram-circular", '\ue0ec'),
    SOCIAL_LAST_FM("social-last-fm", '\ue0ef'),
    SOCIAL_LAST_FM_CIRCULAR("social-last-fm-circular", '\ue0ee'),
    SOCIAL_LINKEDIN("social-linkedin", '\ue0f1'),
    SOCIAL_LINKEDIN_CIRCULAR("social-linkedin-circular", '\ue0f0'),
    SOCIAL_PINTEREST("social-pinterest", '\ue0f3'),
    SOCIAL_PINTEREST_CIRCULAR("social-pinterest-circular", '\ue0f2'),
    SOCIAL_SKYPE("social-skype", '\ue0f5'),
    SOCIAL_SKYPE_OUTLINE("social-skype-outline", '\ue0f4'),
    SOCIAL_TUMBLER("social-tumbler", '\ue0f7'),
    SOCIAL_TUMBLER_CIRCULAR("social-tumbler-circular", '\ue0f6'),
    SOCIAL_TWITTER("social-twitter", '\ue0f9'),
    SOCIAL_TWITTER_CIRCULAR("social-twitter-circular", '\ue0f8'),
    SOCIAL_VIMEO("social-vimeo", '\ue0fb'),
    SOCIAL_VIMEO_CIRCULAR("social-vimeo-circular", '\ue0fa'),
    SOCIAL_YOUTUBE("social-youtube", '\ue0fd'),
    SOCIAL_YOUTUBE_CIRCULAR("social-youtube-circular", '\ue0fc'),
    SORT_ALPHABETICALLY("sort-alphabetically", '\ue0ff'),
    SORT_ALPHABETICALLY_OUTLINE("sort-alphabetically-outline", '\ue0fe'),
    SORT_NUMERICALLY("sort-numerically", '\ue101'),
    SORT_NUMERICALLY_OUTLINE("sort-numerically-outline", '\ue100'),
    SPANNER("spanner", '\ue103'),
    SPANNER_OUTLINE("spanner-outline", '\ue102'),
    SPIRAL("spiral", '\ue104'),
    STAR("star", '\ue109'),
    STARBURST("starburst", '\ue10b'),
    STARBURST_OUTLINE("starburst-outline", '\ue10a'),
    STAR_FULL_OUTLINE("star-full-outline", '\ue105'),
    STAR_HALF("star-half", '\ue107'),
    STAR_HALF_OUTLINE("star-half-outline", '\ue106'),
    STAR_OUTLINE("star-outline", '\ue108'),
    STOPWATCH("stopwatch", '\ue10c'),
    SUPPORT("support", '\ue10d'),
    TABS_OUTLINE("tabs-outline", '\ue10e'),
    TAG("tag", '\ue10f'),
    TAGS("tags", '\ue110'),
    THERMOMETER("thermometer", '\ue119'),
    THUMBS_DOWN("thumbs-down", '\ue11a'),
    THUMBS_OK("thumbs-ok", '\ue11b'),
    THUMBS_UP("thumbs-up", '\ue11c'),
    TH_LARGE("th-large", '\ue112'),
    TH_LARGE_OUTLINE("th-large-outline", '\ue111'),
    TH_LIST("th-list", '\ue114'),
    TH_LIST_OUTLINE("th-list-outline", '\ue113'),
    TH_MENU("th-menu", '\ue116'),
    TH_MENU_OUTLINE("th-menu-outline", '\ue115'),
    TH_SMALL("th-small", '\ue118'),
    TH_SMALL_OUTLINE("th-small-outline", '\ue117'),
    TICK("tick", '\ue11e'),
    TICKET("ticket", '\ue11f'),
    TICK_OUTLINE("tick-outline", '\ue11d'),
    TIME("time", '\ue120'),
    TIMES("times", '\ue122'),
    TIMES_OUTLINE("times-outline", '\ue121'),
    TRASH("trash", '\ue123'),
    TREE("tree", '\ue124'),
    UPLOAD("upload", '\ue126'),
    UPLOAD_OUTLINE("upload-outline", '\ue125'),
    USER("user", '\ue12c'),
    USER_ADD("user-add", '\ue128'),
    USER_ADD_OUTLINE("user-add-outline", '\ue127'),
    USER_DELETE("user-delete", '\ue12a'),
    USER_DELETE_OUTLINE("user-delete-outline", '\ue129'),
    USER_OUTLINE("user-outline", '\ue12b'),
    VENDOR_ANDROID("vendor-android", '\ue12d'),
    VENDOR_APPLE("vendor-apple", '\ue12e'),
    VENDOR_MICROSOFT("vendor-microsoft", '\ue12f'),
    VIDEO("video", '\ue131'),
    VIDEO_OUTLINE("video-outline", '\ue130'),
    VOLUME("volume", '\ue135'),
    VOLUME_DOWN("volume-down", '\ue132'),
    VOLUME_MUTE("volume-mute", '\ue133'),
    VOLUME_UP("volume-up", '\ue134'),
    WARNING("warning", '\ue137'),
    WARNING_OUTLINE("warning-outline", '\ue136'),
    WATCH("watch", '\ue138'),
    WAVES("waves", '\ue13a'),
    WAVES_OUTLINE("waves-outline", '\ue139'),
    WEATHER_CLOUDY("weather-cloudy", '\ue13b'),
    WEATHER_DOWNPOUR("weather-downpour", '\ue13c'),
    WEATHER_NIGHT("weather-night", '\ue13d'),
    WEATHER_PARTLY_SUNNY("weather-partly-sunny", '\ue13e'),
    WEATHER_SHOWER("weather-shower", '\ue13f'),
    WEATHER_SNOW("weather-snow", '\ue140'),
    WEATHER_STORMY("weather-stormy", '\ue141'),
    WEATHER_SUNNY("weather-sunny", '\ue142'),
    WEATHER_WINDY("weather-windy", '\ue144'),
    WEATHER_WINDY_CLOUDY("weather-windy-cloudy", '\ue143'),
    WINE("wine", '\ue147'),
    WI_FI("wi-fi", '\ue146'),
    WI_FI_OUTLINE("wi-fi-outline", '\ue145'),
    WORLD("world", '\ue149'),
    WORLD_OUTLINE("world-outline", '\ue148'),
    ZOOM("zoom", '\ue14f'),
    ZOOM_IN("zoom-in", '\ue14b'),
    ZOOM_IN_OUTLINE("zoom-in-outline", '\ue14a'),
    ZOOM_OUT("zoom-out", '\ue14d'),
    ZOOM_OUTLINE("zoom-outline", '\ue14e'),
    ZOOM_OUT_OUTLINE("zoom-out-outline", '\ue14c');

    private static final String ERROR_DESCRIPTION_BLANK = "Argument 'description' must not be blank";

    public static TypIconFont findByDescription(@Nonnull String description) {
        requireNonBlank(description, "Icon description must not be blank.");

        String[] parts = description.split(":");
        for (TypIconFont font : values()) {
            if (font.getDescription().equals(parts[0])) {
                return font;
            }
        }

        throw new IllegalArgumentException("Icon description '" + description + "' is invalid!");
    }

    private String description;
    private char code;

    TypIconFont(@Nonnull String description, char code) {
        this.description = description;
        this.code = code;
    }

    @Nonnull
    public String getDescription() {
        return description;
    }

    public char getCode() {
        return code;
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid TypIcon icon description");
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description, Exception e) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid TypIcon icon description", e);
    }
}