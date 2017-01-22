package com.angelakinder.spotube.services;

/**
 * Created by angelakinder on 2017-01-21.
 */
import java.util.ArrayList;

import com.spotify.sdk.android.authentication.AuthenticationClient;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
import com.spotify.sdk.android.authentication.AuthenticationResponse;
import com.spotify.sdk.android.player.Config;
import com.spotify.sdk.android.player.ConnectionStateCallback;
import com.spotify.sdk.android.player.Error;
import com.spotify.sdk.android.player.Player;
import com.spotify.sdk.android.player.PlayerEvent;
import com.spotify.sdk.android.player.Spotify;
import com.spotify.sdk.android.player.SpotifyPlayer;

public class SpotifyService implements SpotifyPlayer.NotificationCallback, ConnectionStateCallback{
    private final static String CLIENT_ID = "cb39e35554a14fb798162bda36721bfa";
    private final static String CLIENT_SECRET = "4ef6f2dd31354fe8b04ae1d3d60cd33f";

    public ArrayList<String> getPlaylists(){

        return new ArrayList<String>();
    }

    @Override
    public void onLoggedIn() {

    }

    @Override
    public void onLoggedOut() {

    }

    @Override
    public void onLoginFailed(Error error) {

    }

    @Override
    public void onTemporaryError() {

    }

    @Override
    public void onConnectionMessage(String s) {

    }

    @Override
    public void onPlaybackEvent(PlayerEvent playerEvent) {

    }

    @Override
    public void onPlaybackError(Error error) {

    }
}
