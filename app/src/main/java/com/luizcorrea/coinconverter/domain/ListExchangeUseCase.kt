package com.luizcorrea.coinconverter.domain

import com.luizcorrea.coinconverter.core.UseCase
import com.luizcorrea.coinconverter.data.model.ExchangeResponseValue
import com.luizcorrea.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}