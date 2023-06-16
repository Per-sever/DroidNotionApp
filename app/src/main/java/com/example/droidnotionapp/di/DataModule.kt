package com.example.droidnotionapp.di

import com.example.droidnotionapp.data.repository.NotionDbRepositoryImpl
import com.example.droidnotionapp.domain.NotionDbRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    abstract fun bindNotionDbRepositoryImpl(impl: NotionDbRepositoryImpl): NotionDbRepository
}