package com.luizcorrea.coinconverter.domain

import com.luizcorrea.coinconverter.core.UseCase
import com.luizcorrea.coinconverter.data.model.ExchangeResponseValue
import com.luizcorrea.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}