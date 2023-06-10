package com.example.marsphotos.data

import com.example.marsphotos.network.Marsphoto
import com.example.marsphotos.network.MarsApiService


interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<Marsphoto>
}

class DefaultMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository{
    override suspend fun getMarsPhotos(): List<Marsphoto> = marsApiService.getPhotos()
}
