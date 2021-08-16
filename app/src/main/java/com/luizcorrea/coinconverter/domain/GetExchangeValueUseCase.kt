package com.luizcorrea.coinconverter.domain

import com.luizcorrea.coinconverter.core.UseCase
import com.luizcorrea.coinconverter.data.model.ExchangeResponseValue
import com.luizcorrea.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>() {

    override suspend fun execute(param: String)
    : Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }

}