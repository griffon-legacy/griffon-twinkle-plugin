/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package griffon.plugins.twinkle.impl;

import ch.swingfx.twinkle.NotificationBuilder;
import ch.swingfx.twinkle.event.INotificationEventListener;
import ch.swingfx.twinkle.manager.INotificationManager;
import ch.swingfx.twinkle.style.INotificationStyle;
import ch.swingfx.twinkle.style.theme.DarkDefaultNotification;
import ch.swingfx.twinkle.window.IPosition;

import javax.swing.*;
import java.util.UUID;

/**
 * @author Andres Almiray
 */
public class Notification {
    private NotificationBuilder notificationBuilder = new NotificationBuilder();

    public Notification() {
        setStyle(new DarkDefaultNotification());
    }

    public NotificationBuilder getNotificationBuilder() {
        return notificationBuilder;
    }

    public NotificationBuilder setStyle(INotificationStyle style) {
        return notificationBuilder.withStyle(style);
    }

    public NotificationBuilder setTitle(String title) {
        return notificationBuilder.withTitle(title);
    }

    public INotificationStyle getStyle() {
        return notificationBuilder.getStyle();
    }

    public NotificationBuilder setMessage(String message) {
        return notificationBuilder.withMessage(message);
    }

    public NotificationBuilder setNotificationManager(INotificationManager manager) {
        return notificationBuilder.withNotificationManager(manager);
    }

    public NotificationBuilder setDisplayTime(int timeInMillis) {
        return notificationBuilder.withDisplayTime(timeInMillis);
    }

    public NotificationBuilder setPosition(IPosition position) {
        return notificationBuilder.withPosition(position);
    }

    public NotificationBuilder setListener(INotificationEventListener listener) {
        return notificationBuilder.withListener(listener);
    }

    public NotificationBuilder setFadeInAnimation(boolean animate) {
        return notificationBuilder.withFadeInAnimation(animate);
    }

    public NotificationBuilder setFadeOutAnimation(boolean animate) {
        return notificationBuilder.withFadeOutAnimation(animate);
    }

    public NotificationBuilder setIcon(Icon icon) {
        return notificationBuilder.withIcon(icon);
    }

    public UUID show() {
        return notificationBuilder.showNotification();
    }
}
