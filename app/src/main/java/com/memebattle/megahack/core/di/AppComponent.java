package com.memebattle.megahack.core.di;

import com.memebattle.megahack.core.di.module.ApiModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiModule.class})
public interface AppComponent {

}
