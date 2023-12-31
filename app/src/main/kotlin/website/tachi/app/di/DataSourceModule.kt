package website.tachi.app.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.jetbrains.annotations.Async.Schedule
import website.tachi.app.data.datasource.address.AddressDataSource
import website.tachi.app.data.datasource.address.AddressDataSourceImpl
import website.tachi.app.data.datasource.auth.AuthDataSource
import website.tachi.app.data.datasource.auth.AuthDataSourceImpl
import website.tachi.app.data.datasource.auth.AuthTokenDataSource
import website.tachi.app.data.datasource.auth.AuthTokenDataSourceImpl
import website.tachi.app.data.datasource.festival.FestivalDataSource
import website.tachi.app.data.datasource.festival.FestivalDataSourceImpl
import website.tachi.app.data.datasource.guide.GuideDataSource
import website.tachi.app.data.datasource.guide.GuideDataSourceImpl
import website.tachi.app.data.datasource.keyword.KeywordDataSource
import website.tachi.app.data.datasource.keyword.KeywordDataSourceImpl
import website.tachi.app.data.datasource.location.LocationDataSource
import website.tachi.app.data.datasource.location.LocationDataSourceImpl
import website.tachi.app.data.datasource.mainbg.MainBackgroundImageUrlDataSource
import website.tachi.app.data.datasource.mainbg.MainBackgroundImageUrlDataSourceImpl
import website.tachi.app.data.datasource.preference.SearchPreferenceDataSource
import website.tachi.app.data.datasource.preference.SearchPreferenceDataSourceImpl
import website.tachi.app.data.datasource.reviews.ReviewDataSource
import website.tachi.app.data.datasource.reviews.ReviewDataSourceImpl
import website.tachi.app.data.datasource.schedule.ScheduleDataSource
import website.tachi.app.data.datasource.schedule.ScheduleDataSourceImpl
import website.tachi.app.data.datasource.spots.SpotDataSource
import website.tachi.app.data.datasource.spots.SpotDataSourceImpl
import website.tachi.app.data.network.model.FestivalData
import website.tachi.app.data.network.model.GuideData
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class DataSourceModule {
    @Binds
    @Singleton
    abstract fun bindAuthDataSource(source: AuthDataSourceImpl): AuthDataSource

    @Binds
    @Singleton
    abstract fun bindAuthTokenDataSource(source: AuthTokenDataSourceImpl): AuthTokenDataSource

    @Binds
    @Singleton
    abstract fun bindFestivalDataSource(source: FestivalDataSourceImpl): FestivalDataSource

    @Binds
    @Singleton
    abstract fun bindKeywordDataSource(source: KeywordDataSourceImpl): KeywordDataSource

    @Binds
    @Singleton
    abstract fun bindPreferenceDataSource(source: SearchPreferenceDataSourceImpl): SearchPreferenceDataSource

    @Binds
    @Singleton
    abstract fun bindLocationDataSource(source: LocationDataSourceImpl): LocationDataSource

    @Binds
    @Singleton
    abstract fun bindAddressDataSource(source: AddressDataSourceImpl): AddressDataSource

    @Binds
    @Singleton
    abstract fun bindScheduleDataSource(source: ScheduleDataSourceImpl): ScheduleDataSource

    @Binds
    @Singleton
    abstract fun bindGuideDataSource(source : GuideDataSourceImpl) : GuideDataSource

    @Binds
    @Singleton
    abstract fun bindReviewDataSource(source : ReviewDataSourceImpl) : ReviewDataSource

    @Binds
    @Singleton
    abstract fun bindSpotDataSource(source : SpotDataSourceImpl) : SpotDataSource

    @Binds
    @Singleton
    abstract fun bindMainBackgroundImageUrlDataSource(source : MainBackgroundImageUrlDataSourceImpl) : MainBackgroundImageUrlDataSource
}