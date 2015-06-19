#!/bin/bash
#-Dstats.block=10000000 \

# export PATH=/System/Library/Frameworks/JavaVM.framework/Versions/1.6/Home/bin:$PATH

nice \
	java \
		-Djava.awt.headless=true \
		-cp target/classes \
		org.alcibiade.eternity.editor.application.ConsoleApp \
			EternityII.txt \
				"0xIterative Path MkI[90]" \
				"0xIterative Path MkIII[90]" \
				"0xSwap Weighted MkIV" \
				"0xSwap Weighted MkV" \
				"0xSwap Weighted MkV[1800]" \
				"0xSwap Weighted MkVI" \
				"0xSwap Weighted MkVII" \
				"8xPipeline[600]"
