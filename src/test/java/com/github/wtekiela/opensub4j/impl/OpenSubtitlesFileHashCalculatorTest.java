package com.github.wtekiela.opensub4j.impl;

import static org.testng.Assert.*;

import java.io.File;

import com.github.wtekiela.opensub4j.api.FileHashCalculator;
import org.testng.annotations.Test;

public class OpenSubtitlesFileHashCalculatorTest {

    @Test
    public void testReferenceFie() throws Exception {
        // given:
        FileHashCalculator calc = new OpenSubtitlesFileHashCalculator();
        // when:
        String hash = calc.calculateHash(new File(this.getClass().getResource("/breakdance.avi").toURI()));
        // then:
        assertEquals(hash, "8e245d9679d31e12");
    }

}