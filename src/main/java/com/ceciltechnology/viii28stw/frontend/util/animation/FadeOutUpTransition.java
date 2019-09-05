/*
    Animation For JavaFX
*/

package com.ceciltechnology.viii28stw.frontend.util.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;


/* 
    Created on : Sep 13, 2014, 8:45:48 AM
    Author     : herudi-pc
*/

public class FadeOutUpTransition extends configAnimasi {
    /**
     * Create new FadeOutUpTransition
     * 
     * @param node The node to affect
     */
    public FadeOutUpTransition(final Node node) {
        super(node, getTimeline(node));
        setCycleDuration(Duration.seconds(1));
        setDelay(Duration.seconds(0));
    }

    private static Timeline getTimeline(Node node) {
        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll(
                new KeyFrame(Duration.millis(50),    
                        new KeyValue(node.opacityProperty(), 1, WEB_EASE),
                        new KeyValue(node.translateYProperty(), 0, WEB_EASE)
                    ),
                    new KeyFrame(Duration.millis(500),    
                        new KeyValue(node.opacityProperty(), 0, WEB_EASE),
                        new KeyValue(node.translateYProperty(), -10, WEB_EASE)
                    ));
        return timeline;
    }
    
    @Override protected void stopping() {
        super.stopping();
        node.setTranslateY(0);
        node.toBack();// restore default
    }
}
